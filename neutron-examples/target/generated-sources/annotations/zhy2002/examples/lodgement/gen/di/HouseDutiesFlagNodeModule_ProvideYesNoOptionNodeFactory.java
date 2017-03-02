package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HouseDutiesFlagNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final HouseDutiesFlagNodeModule module;

  public HouseDutiesFlagNodeModule_ProvideYesNoOptionNodeFactory(HouseDutiesFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(HouseDutiesFlagNodeModule module) {
    return new HouseDutiesFlagNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link HouseDutiesFlagNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(HouseDutiesFlagNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}
