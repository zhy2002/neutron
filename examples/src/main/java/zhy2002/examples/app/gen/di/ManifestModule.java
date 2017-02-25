package zhy2002.examples.app.gen.di;
import dagger.*;

@Module(subcomponents = {
    AppManagerNodeComponent.class,
    LodgementNodeComponent.class
})
public class ManifestModule {
}