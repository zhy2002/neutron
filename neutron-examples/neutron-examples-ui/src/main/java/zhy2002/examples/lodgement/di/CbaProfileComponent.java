package zhy2002.examples.lodgement.di;

import dagger.Component;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;

import javax.inject.Singleton;

@Singleton
@Component(modules = {CbaProfileModule.class})
public interface CbaProfileComponent {
    ApplicationNodeContext provideApplicationNodeContext();
}
