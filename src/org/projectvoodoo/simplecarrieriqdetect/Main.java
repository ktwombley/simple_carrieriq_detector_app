
package org.projectvoodoo.simplecarrieriqdetect;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Detect detect = new Detect();
        detect.findEverything();

        detect.listFoundInLogcat();
    }
}
