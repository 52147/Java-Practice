### Date and Time API (java.time)

The new Date and Time API in Java 8 provides a comprehensive and flexible way to handle date and time.

**LocalDate, LocalTime, LocalDateTime:**

```java
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.now();

LocalDate specificDate = LocalDate.of(2023, Month.JULY, 19);
LocalTime specificTime = LocalTime.of(14, 30);
LocalDateTime specificDateTime = LocalDateTime.of(2023, Month.JULY, 19, 14, 30);
```

**Duration and Period:**

```java
Duration duration = Duration.ofHours(5);
Period period = Period.ofDays(10);

LocalDate date = LocalDate.now().plus(period);
LocalTime time = LocalTime.now().plus(duration);
```

**DateTimeFormatter:**

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
String formattedDate = dateTime.format(formatter);
LocalDateTime parsedDate = LocalDateTime.parse("2023-07-19 14:30", formatter);
