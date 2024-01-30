Section 1 Overview
1 Updating Scene Switch
	Currently, whenever there's a scene change it creates a brand new window and doesn't close the previous one. I want to add a class that keeps everything on the same window but still switches scenes

2 Cleanup Crew
	Organizing all the different classes for each of the functions is important for updating the code. Some don't need their own scripts and can be combined with others. This helps alleviate project size and make everything more efficient.  Additionally, I'm going to have the items or the food that you have be readable from a file. So this way you can create new food types just by providing images maybe a key and a location or whatever other properties are needed. This would allow it to be more flexible and also would clean up some of the hard coding in 

3 Better UI
	There's not good way to say this, but the UI and design of everything just looks like trash. The stat counter in the corner is awful, the levels are not consistent with the menus, we didn't add the animation we promised, and the food items/tutorial hurt to look at. Improving everything would simply make the whole game better.

Section 2 Pseudocode
1
new class game state
	menu
	title
	tutorial
	exit game

new class gameScreen
	 void UI
	 	design elements
	 void sceneSwitching
	 	game states
2
Code isn't really needed, simply combining classes together
ex) food = food + foodtype
But for the readable file food types:
	public stringToString:
		get food.txt
		for (0;i<0;i++)
			if readLine i == foodtype
				return foodtype
			i++

3
Code isn't really needed, simply impove the UI images
ex) change images, update background, change score streak corner

Section 3
To see the scene switch, simply play the game and notice how it doesn't open a new window
To see the combined classes, open up Food and Foodtype classes
To see the new game UI, run the "Score_Streak" class