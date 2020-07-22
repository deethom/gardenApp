# gardenApp
An Android app that keeps track of various inventories for Garden locations, for summer vegetable gardeners. i.e. how much kale, lettuce, tomatoes, did you pick at Location A, Location B, etc.
# gardenApp
An Android app that keeps track of various inventories for Garden locations, for summer vegetable gardeners. i.e. how much kale, lettuce, tomatoes, did you pick at Location A, Location B, etc.

REQUIREMENTS:

User Stories/Test Cases:
*...Test cases will be listed by button pushes, seperated by commas...*
User 1:
harvest, cp, lettuce, 2,+,add more, broccoli, 4, +, finish harvesting, view inventory

User 2:
harvest, medtronic, lettuce, 4, clear, 0, clear, 5, +, change garden, gouin, kale, 5, +, add more, cucumber, 4, +, finish harvesting, view inventory

User 3:
harvest, cummins, beans, 10, +, change garden, medtronic, basil, 5, +, finish harvesting, view inventory


Source Code Written by David Thomas: 
app/src/main/java/com/example/gardeninventory/MainActivity
app/src/main/java/com/example/gardeninventory/PickLocationActivity
app/src/main/java/com/example/gardeninventory/PickPlantActivity
app/src/main/java/com/example/gardeninventory/EnterAmountActivity
app/src/main/java/com/example/gardeninventory/ToContinueActivity
app/src/main/java/com/example/gardeninventory/MyApplication
app/src/main/java/com/example/gardeninventory/GardenState
app/src/main/java/com/example/gardeninventory/PlantState
# gardenApp
An Android app that keeps track of various inventories for Garden locations, for summer vegetable gardeners. i.e. how much kale, lettuce, tomatoes, did you pick at Location A, Location B, etc.

REQUIREMENTS:
-The app must keep count of inventories for daily vegetable harvests. 
-The User navigates through app with buttons only.
-From the Main Activity the user can press "Harvest" or "Inventory"
-There are 4 activities to go through to add an item to the inventory if the user presses "Harvest: PickLocation, PickPlant, EnterAmount.
-At the 5th activity, ToConinue, the user has the option to pick a new plant (staying at the same location), to change locations (and subsequently change the plant as well), and finally 
to finish harvesting all together, bringing the user to the MainActivity.
-If the user selects view inventory, it will list the inventory from the session.

User Stories/Test Cases:
*...Test cases will be listed by button pushes, seperated by commas...*
User 1:
harvest, cp, lettuce, 2,+,add more, broccoli, 4, +, finish harvesting, view inventory

User 2:
harvest, medtronic, lettuce, 4, clear, 0, clear, 5, +, change garden, gouin, kale, 5, +, add more, cucumber, 4, +, finish harvesting, view inventory

User 3:
harvest, cummins, beans, 10, +, change garden, medtronic, basil, 5, +, finish harvesting, view inventory


Source Code Written by David Thomas (Summer 2020), 
in Android Studio 4.0
Build #AI-193.6911.18.40.6514223, built on May 20, 2020
Runtime version: 1.8.0_242-release-1644-b3-6222593 x86_64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
macOS 10.15.5
GC: ParNew, ConcurrentMarkSweep
Memory: 1981M
Cores: 8

Files:
app/src/main/java/com/example/gardeninventory/MainActivity.java
app/src/main/java/com/example/gardeninventory/PickLocationActivity.java
app/src/main/java/com/example/gardeninventory/PickPlantActivity.java
app/src/main/java/com/example/gardeninventory/EnterAmountActivity.java
app/src/main/java/com/example/gardeninventory/ToContinueActivity.java
app/src/main/java/com/example/gardeninventory/MyApplication.java
app/src/main/java/com/example/gardeninventory/GardenState.java
app/src/main/java/com/example/gardeninventory/PlantState.java
app/src/main/java/com/example/gardeninventory/ViewInventoryActivity.java



*****ARCHITECTURE*****
-The Application relies on activities to navigate the user through the system.
From the Main Activity the user can press "Harvest" or "Inventory"
-There are 4 activities to go through to add an item to the inventory if the user presses "Harvest: PickLocation, PickPlant, EnterAmount.
-At the 5th activity, ToConinue, the user has the option to pick a new plant (staying at the same location), to change locations (and subsequently change the plant as well), and finally 
to finish harvesting all together, bringing the user to the MainActivity.
-If the user selects view inventory, it will list the inventory from the session.
