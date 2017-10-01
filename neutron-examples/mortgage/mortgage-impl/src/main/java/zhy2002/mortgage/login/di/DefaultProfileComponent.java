package zhy2002.mortgage.login.di;

import dagger.Component;
import zhy2002.mortgage.login.gen.LoginNodeContext;
import zhy2002.mortgage.login.gen.di.ManifestModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ManifestModule.class})
public interface DefaultProfileComponent {
    LoginNodeContext provideLoginNodeContext();
}
