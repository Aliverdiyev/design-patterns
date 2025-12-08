package creational.builder;
// Ordering a custom burger (bun + cheese + no onions + extra sauce).
class User {
    private final String firstName; // required
    private final int age;          // optional

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.age = builder.age;
    }

    public static class Builder {
        private String firstName;
        private int age;

        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}