# Java Stream API

A collection of Java programs demonstrating the **Stream API** and **functional programming** concepts introduced in Java 8+.

## Project Structure

```
├── com.assessment/        # Playlist & Track stream exercises
│   ├── Main.java          # Stream operations on a music library
│   ├── Playlist.java      # Playlist model
│   └── Track.java         # Track model
│
└── com.example/           # Basic stream & functional interface examples
    ├── Calculator.java     # Custom functional interface
    ├── Countries.java      # Stream pipeline: map, filter, sorted, collect
    ├── Greetings.java      # Lambda / method reference examples
    └── printhello.java     # Hello World with streams/lambdas
```

## Topics Covered

### Stream Operations
| Operation | Description |
|-----------|-------------|
| `stream()` | Creates a stream from a collection |
| `flatMap()` | Flattens nested streams into one |
| `map()` | Transforms each element |
| `filter()` | Filters elements by a predicate |
| `sorted()` | Sorts elements (natural or custom comparator) |
| `distinct()` | Removes duplicates |
| `limit()` / `skip()` | Slicing streams |
| `peek()` | Inspect elements without consuming the stream |
| `collect()` | Terminal operation — collects into a List, Map, etc. |
| `groupingBy()` | Groups elements into a `Map<K, List<V>>` |

### Functional Interfaces
- Custom `@FunctionalInterface` (`Calculator`)
- Lambda expressions
- Method references

## Assessment Exercises (`com.assessment`)

Stream operations practised on a **music library** (list of playlists, each containing tracks):

1. List of artists with track titles
2. Track durations converted to minutes
3. Flat list of all tracks from all playlists
4. Unique artist names
5. Playlist name repeated per track (`flatMap` vs `map`)
6. Distinct artist names from the library
7. Distinct track titles
8. Tracks sorted by title (ascending)
9. Tracks sorted by duration (descending)
10. Tracks sorted by rating desc, then title asc
11. First 10 tracks by rating desc
12. Skip first 5 longest tracks
13. Any 3 tracks using `limit`
14. Filter tracks with rating ≥ 4 using `peek` for logging
15. Group tracks by artist into `Map<String, List<Track>>`

## Prerequisites

- Java 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code with Java extension)

## Running

Compile and run any class from the project root:

```bash
javac com.assessment/Track.java com.assessment/Playlist.java com.assessment/Main.java
java -cp . Main
```

```bash
javac com.example/Countries.java
java -cp . Countries
```
