package zhy2002.examples.register.di;

import dagger.Component;
import zhy2002.examples.register.gen.RegisterNodeContext;

import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class})
//Please provide this class if it is missing.
public interface DefaultProfileComponent {

    RegisterNodeContext provideRegisterNodeContext();

}
