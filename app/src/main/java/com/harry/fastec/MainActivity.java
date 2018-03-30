package com.harry.fastec;

import com.harry.harry_core.activities.ProxyActivity;
import com.harry.harry_core.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new MainDelegate();
    }

}
