package zhy2002.examples.app.di;

import dagger.Component;
import zhy2002.examples.app.gen.GlobalUiStateNodeContext;

import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class})
public interface DefaultProfileComponent {

    GlobalUiStateNodeContext provideGlobalUiStateNodeContext();
}
