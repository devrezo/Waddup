package name.rajaneesh.waddup;

import android.app.Application;

import com.parse.Parse;

public class WaddupApplication extends Application {
	
	@Override
	public void onCreate(){
		super.onCreate();
		// Enable Local Datastore.
		
		Parse.enableLocalDatastore(this);
		 
		Parse.initialize(this, "jaC5xlZ9h3iwskawzW9s5luHhWFNlB7T5sPMapee", "frnfhccVbW7r9JHqGOhcH9X2mLY7KiDt7uCj5AEi");
		
		
	}
}
