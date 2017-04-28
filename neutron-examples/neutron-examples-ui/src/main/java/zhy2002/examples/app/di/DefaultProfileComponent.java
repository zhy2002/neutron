package zhy2002.examples.app.di;

import dagger.Component;
import zhy2002.examples.app.gen.LodgementNodeContext;

import javax.inject.Singleton;


@Singleton
@Component(modules = {DefaultProfileModule.class}) //Please provide this class if it is missing.
public interface DefaultProfileComponent {

    LodgementNodeContext provideLodgementNodeContext();
}
