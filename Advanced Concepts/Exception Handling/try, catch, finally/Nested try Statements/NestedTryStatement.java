// Nested try Statements:

// try blocks can be nested to handle exceptions at different levels.
try {
    try {
        // Code that may throw an exception
    } catch (IOException e) {
        // Handle IOException
    }
} catch (Exception e) {
    // Handle any other exceptions
}
