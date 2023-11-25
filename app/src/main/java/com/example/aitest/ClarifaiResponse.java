package com.example.aitest;

import java.util.List;

public class ClarifaiResponse {
    private List<Output> outputs;

    public List<Output> getOutputs() {
        return outputs;
    }

    public static class Output {
        private Data data;

        public Data getData() {
            return data;
        }
    }

    public static class Data {
        private List<Concept> concepts;

        public List<Concept> getConcepts() {
            return concepts;
        }
    }

    public static class Concept {
        private String id;
        private String name;
        private float value;
        private String app_id;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public float getValue() {
            return value;
        }

        public String getAppId() {
            return app_id;
        }
    }
}

