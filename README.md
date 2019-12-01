# Jetpack-4-NavigationComponent
Based on a default project template Fragment + ViewModel.

This app shows the usage of a splash screen and the navigation component, basically passing an object as parameter.
This demonstration version uses buttons to send different information to the next fragment(dragon's detail fragment). We also use safeargs to pass the information via navigation controller.

## Splash screen
The splash screen is used as a new theme, hence there is no activity for the splash screen which will otherwise make the user wait a defined period of time, before showing the main screen of your app.

create a theme in styles.xml adding the following, and set your splash image.
``` xml
    <style name="SplashTheme" parent="Theme.AppCompat.NoActionBar">
        <item name="android:windowBackground">@drawable/httyd_splash_background</item>
    </style>
```

next refence it in the AndroidManifest.xml file, change the theme of your entrypoint app class:

```xml
<activity android:name=".MainActivity" android:theme="@style/SplashTheme">
```
Lastly, do not forget to set the original theme(Base application theme, in this example AppTheme) of your MainActivity back, otherwise it will have the image as background. 
in the onCreate method of your MainActivity, before the super, add:
```java
setTheme(R.style.AppTheme);
```
That's all, it will show the spash screen image while your Activity is loading, so the user won't wait any additional time, more than the required to load the MainActivity.

## Basic NavigationComponent application
![storyboard](https://user-images.githubusercontent.com/4823319/69899538-e4672b00-13bb-11ea-82b8-1bef8b71e1b5.jpg)

Notice that there is no splash activity in the navigation graph.

## Splash image shown while the MainActivity is loading (just a simple jpg image: @drawable/httyd_splash_background)
<img src="https://user-images.githubusercontent.com/4823319/69899539-e4672b00-13bb-11ea-846b-5171be33301e.jpg" width="40%" height="40%">

## App in action
<img src="https://user-images.githubusercontent.com/4823319/69899679-0792da00-13be-11ea-8e04-ed49e4ef6450.gif" width="50%" height="50%">
