package in.gagan.design.pattern.creational;

public class Builder {
    private String name;
    private String type;
    private String option;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getOption() {
        return this.option;
    }

    private Builder(BuilderBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.option = builder.option;
    }

    public static class BuilderBuilder {
        private String name;
        private String type;
        private String option;

        public BuilderBuilder(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public BuilderBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderBuilder type(String type) {
            this.type = type;
            return this;
        }

        public BuilderBuilder option(String option) {
            this.option = option;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        Builder b = new Builder.BuilderBuilder("", "")
                                .option("")
                                .name("")
                                .build();
    }
}
