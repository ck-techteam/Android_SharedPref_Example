<article class="markdown-body entry-content" itemprop="text">
<h1><a id="UseSharedPreferences in android" class="anchor" href="#UseSharedPreferences in android" aria-hidden="true"></a>UseSharedPreferences in android</h1>

<p>

Android provides many ways of storing data of an application. One of these ways is Shared Preferences. Shared Preferences allows you to save and retrieve data in the form of key, value pair.</p>
<p>
In order to use shared preferences, you have to call a method getSharedPreferences() that returns a SharedPreference instance pointing to the file that contains the values of preferences.

</p>
<p>
getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
</p>
<li><strong>Step 1:</strong>  First Create a xml file to get the input using edit text.
<br><br>
<img src="http://armorappz.com/github/mainactivyxmlsharedpref.png">
</li>

<li><strong>Step 2:</strong>  Create the MainActivity .class to the pass the value and retrieve the value via edittext and on button click. Input the value in the editText and click insert button so that the value is inserted in the shared Preferences. 
<br><br>
</li>
<li><strong>Step 3:</strong> And when you click on the retrieve button the value which is stored is retrieved and showed in the same editText. Declare all the values and create a shared preference object and using that object insert the values in the shared preference. The commit of method is called and the value is successfully inserted.
<br><br>
<img src="http://armorappz.com/github/mainactivitysharedpref.png">
</li>

</article>
