# Test Documentation

## Overview

This project contains a comprehensive set of JUnit 5 tests covering all major components of the drink-related domain classes, including:

- `SimpleDrink`
- `Cocktail`
- `DrinkQueue`
- `StringQueue`

Each test class is designed to verify both typical and edge-case behavior of the associated functionality.

## Test Coverage

✅ All tests have been written to achieve **100% code coverage**, ensuring that:

- Every method and branch is tested.
- Exceptions and invalid inputs are handled.
- All getter and setter logic is covered (where applicable).
- Alcohol percentage calculations and queue behaviors are validated.

## Test Classes

| Class          | Description                                                |
|----------------|------------------------------------------------------------|
| SimpleDrinkTest| Tests for volume, alcohol percentage and isAlcoholic flag. |
| CocktailTest   | Tests complex drink compositions and correct calculations. |
| DrinkQueueTest | Tests a custom drink queue implementation (FIFO behavior). |
| StringQueueTest| Tests a bounded string queue with proper exception logic.  |

## How to Run Tests

Tests can be run using your IDE or via the command line with Maven/Gradle. Example with Maven:

```bash
mvn test
