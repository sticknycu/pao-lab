##### Exercise 1:

Story: You are working on a project to develop a video game that involves exploring a virtual world. You have been tasked with creating a feature that allows players to search for treasure chests hidden throughout the game world. You decide to use an Iterator to search for the treasure chests in each area of the game world.

Requirements:

- Create a List of Area objects representing each area in the game world. Each Area object should have a List of TreasureChest objects representing the treasure chests in that area.
- Implement a TreasureChest class that has a getValue() method that returns the value of the treasure chest.
- Create an Iterator that iterates over all of the TreasureChest objects in the game world. 
- Implement a findMostValuableChest() method that uses the Iterator to search for the most valuable treasure chest in the game world.

##### Exercise 2:

Story: You are working on a project to develop a music streaming service that allows users to listen to songs and create playlists. You have been tasked with implementing a feature that allows users to search for songs in their playlists using a keyword. You decide to use a Spliterator to search for the songs in each playlist.

Requirements:

- Create a Playlist class that has a List of Song objects representing the songs in the playlist.
- Implement a Song class that has a getTitle() method that returns the title of the song.
- Create a Spliterator that iterates over all of the Song objects in a Playlist.
- Implement a searchPlaylist() method that takes a keyword as input and uses the Spliterator to search for all of the songs in the user's playlists that contain the keyword in their title.

##### Exercise 3:

Story: You are working on a project to develop a weather monitoring system that collects data from sensors placed throughout a city. You have been tasked with implementing a feature that allows users to view the temperature readings from each sensor in real-time. You decide to use an infinite Spliterator to continuously stream the temperature readings from each sensor.

Requirements:

- Create a Sensor class that has a getTemperature() method that returns the current temperature reading from the sensor.
- Implement a Spliterator that generates an infinite stream of temperature readings from each sensor.
- Create a WeatherMonitor class that uses the Spliterator to continuously display the temperature readings from each sensor in real-time.
- Implement a stopMonitoring() method that stops the WeatherMonitor from displaying the temperature readings.