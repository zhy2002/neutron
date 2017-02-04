package zhy2002.examples.app.di;

import dagger.Component;
import zhy2002.examples.app.gen.LodgementNodeContext;

@LodgementNodeScope
@Component(modules = {LodgementContextModule.class})
public interface LodgementContextComponent {

    LodgementNodeContext provideLodgementNodeContext();
}
