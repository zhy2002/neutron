package zhy2002.mortgage.manager.di;

import dagger.Component;
import zhy2002.mortgage.manager.gen.GlobalUiStateNodeContext;

import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class})
public interface DefaultProfileComponent {

    GlobalUiStateNodeContext provideGlobalUiStateNodeContext();
}
