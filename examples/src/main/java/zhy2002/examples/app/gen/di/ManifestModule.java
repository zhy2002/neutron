package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@Module(subcomponents = {
    AppManagerNodeComponent.class,
    LodgementNodeComponent.class
})
public class ManifestModule {
}