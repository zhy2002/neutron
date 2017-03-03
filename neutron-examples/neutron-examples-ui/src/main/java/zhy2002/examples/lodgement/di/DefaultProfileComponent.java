package zhy2002.examples.lodgement.di;

import dagger.Component;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.di.DefaultProfileModule;
import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class}) //Please provide this class if it is missing.
public interface DefaultProfileComponent {

    ApplicationNodeContext provideApplicationNodeContext();

}
