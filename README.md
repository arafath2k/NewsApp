# NewsApp
This is a basic News App which retrives data from the open source free API and shows the required Top Headlines of different categories.

## Concepts Implemented

* API CALLS
* Recycler View
* Multiple API's

## Librarie's Used

* Volley
* Card View

## Link for fetching Top Headlines(API)

https://newsapi.org/

# Screenshots

![Splash Screen](https://user-images.githubusercontent.com/71012103/104060975-be969180-521d-11eb-9ab2-1619f9aa8ef6.jpeg)
![](https://user-images.githubusercontent.com/71012103/104060980-bfc7be80-521d-11eb-9ff1-a4c705bf6cde.jpeg)

## Problems Faced

Thought of implementing this project using differnt fragments for multiple API's ,which would have been much better way of deploying, but due to some error I faced in the MyAdapter file and the Fragment file , I fetched data from the multiple API's and executed in the same MainActivity.kt file.

# Description

## What does this app do?

* This app fetches data from the real time API (link given) and dispalys the news in to a given space , which consist of an Image, Title, Author.
* This app shows real time news for different categories like **health** , **sports**, **entertainment** etc.
* Categories of the news can be accessed through its respective buttons above the news(recycler view).

## How does the API call works in the MainActivity.kt ?

* Created functions for each category of News namely getData(),getData1().....
* Then by creating a JsonObjectRequest and passing the URL(API) defined inside the function and getting the respective Image, Title , Author (from items_news.xml) and updating it to the adapter and hence we retrive data from the adapter by calling the getData() function in to the OnCreateView() method.
* Defining the corresponding buttons in to the main activity and setting **OnClickListener{}** function and calling the getData() function inside it.

# Future Scope

To make the app more responsive and improvising the UI.
