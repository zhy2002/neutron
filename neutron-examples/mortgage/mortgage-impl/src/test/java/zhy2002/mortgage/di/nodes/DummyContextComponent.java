package zhy2002.mortgage.di.nodes;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DummyContextModule.class, DummyChildNodeModule.class})
public interface DummyContextComponent {

    DummyContext provideDummyContext();
}
