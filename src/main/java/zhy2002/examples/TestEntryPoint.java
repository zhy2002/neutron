package zhy2002.examples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import zhy2002.examples.register.interop.Window;

public class TestEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        System.out.println("Running gwt.");
        RootPanel.get().add(new Label("gwt label here"));
        Window.startReact();
    }
}
