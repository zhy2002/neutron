package zhy2002.examples.app.di;

import dagger.Module;
import zhy2002.examples.app.gen.di.ManifestModule;

@Module(includes = {ManifestModule.class})
abstract class DefaultProfileModule {

}
