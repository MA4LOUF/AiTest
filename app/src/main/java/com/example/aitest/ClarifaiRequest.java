package com.example.aitest;

import java.util.Collections;
import java.util.List;

public class ClarifaiRequest {
    private final List<Input> inputs;

    public ClarifaiRequest(String base64Image) {
        this.inputs = Collections.singletonList(new Input(new Data(new Image(base64Image))));
    }

    public List<Input> getInputs() {
        return inputs;
    }

    static class Input {
        private final Data data;

        Input(Data data) {
            this.data = data;
        }
    }

    static class Data {
        private final Image image;

        Data(Image image) {
            this.image = image;
        }
    }

    static class Image {
        private final String base64;

        Image(String base64) {
            this.base64 = base64;
        }
    }
}

