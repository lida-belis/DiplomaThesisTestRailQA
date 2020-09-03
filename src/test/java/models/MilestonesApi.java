package models;

public class MilestonesApi {
    private int id;
    private String name;

    public static class Builder {
        private MilestonesApi newMilestonesApi;

        public Builder() {
            newMilestonesApi = new MilestonesApi();
        }

        public Builder withName(String name) {
            newMilestonesApi.name = name;
            return this;
        }

        public Builder withId(int id) {
            newMilestonesApi.id = id;
            return this;
        }

        public MilestonesApi build() {
            return newMilestonesApi;
        }
    }

    public int getId() {
        return id;
    }

    public String getName(String lida) {
        return name;
    }

}
