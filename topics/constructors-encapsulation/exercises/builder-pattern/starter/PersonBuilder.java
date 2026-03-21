public class PersonBuilder {
    private String name = "unknown";
    private int age = 0;
    private String email = "unknown";

    /**
     * Sets the name. Returns this builder for chaining.
     *
     * @param name the name
     * @return this builder
     */
    public PersonBuilder setName(String name) {
        // TODO: Set name and return this
        return this;
    }

    /**
     * Sets the age. Returns this builder for chaining.
     *
     * @param age the age
     * @return this builder
     */
    public PersonBuilder setAge(int age) {
        // TODO: Set age and return this
        return this;
    }

    /**
     * Sets the email. Returns this builder for chaining.
     *
     * @param email the email
     * @return this builder
     */
    public PersonBuilder setEmail(String email) {
        // TODO: Set email and return this
        return this;
    }

    /**
     * Builds the person description string.
     *
     * @return "Name: [name], Age: [age], Email: [email]"
     */
    public String build() {
        // TODO: Implement
        return "";
    }
}
