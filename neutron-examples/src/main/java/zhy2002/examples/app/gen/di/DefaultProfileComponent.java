package zhy2002.examples.app.gen.di;

import dagger.Component;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.di.DefaultProfileModule;
import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class}) //Please provide this class if it is missing.
public interface DefaultProfileComponent {

    LodgementNodeContext provideLodgementNodeContext();

}
