# RainyDay (Console Version)

## Introduction
RainyDay is a simple weather application that provides complete weather information built in Java. It utilizes
the free [WeatherAPI](https://www.weatherapi.com/) as the information source and utilizes the
[gson](https://github.com/google/gson) library for JSON serialization and deserialization. This version is purely
a console version; it doesn't include the JavaFX GUI that the general RainyDay Application has. However, it does have
all the same functionality for data retrieval:

![program_start.png](pictures/program_start.png)

## Features
All the features and their associated commands are shown upon application startup. These features are `CURRENT`, 
`FORECAST`, `ASTRONOMY`, `SEARCH`. Of course, you can also exit the application with `EXIT`. Additionally, the
commands are case-insensitive. This means that `forecast` is the same as `FORECAST`, similar to SQL commands.
Note that whenever a location is required for a command, it can be provided in the following forms:

<div align="center">

| Type               | Example                |
|--------------------|------------------------|
| City Name          | Toronto                |
| Specific City Name | toronto-ontario-canada |
| Postal Code        | 90210                  |
| IP Address         | 192.158.1.38           |
| Longitude/Latitude | 38.8/-77.03            |

</div>

### Current Weather
The current weather for a location can be ``

### Forecasted Weather
### Astronomy
### Searching Weather Database