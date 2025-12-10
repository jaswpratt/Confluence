package Lager.impl;

import com.atlassian.sal.api.ApplicationProperties;
import Lager.api.MyPluginComponent;
// A new comment

public class MyPluginComponentImpl implements MyPluginComponent
{
        private final ApplicationProperties applicationProperties;

        public MyPluginComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }
// A new comment
    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }
        // A new comment
        return "myComponent";
    }

}
