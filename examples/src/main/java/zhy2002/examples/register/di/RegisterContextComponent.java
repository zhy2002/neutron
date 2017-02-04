package zhy2002.examples.register.di;

import dagger.Component;
import zhy2002.examples.register.gen.RegisterNodeContext;

@RegisterNodeScope
@Component(modules = {RegisterContextModule.class})
public interface RegisterContextComponent {

    RegisterNodeContext provideRegisterNodeContext();
}
