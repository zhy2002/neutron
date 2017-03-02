package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeFlagNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final ResponsibleSignificantChangeFlagNodeModule module;

  public ResponsibleSignificantChangeFlagNodeModule_ProvideYesNoOptionNodeFactory(
      ResponsibleSignificantChangeFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(
      ResponsibleSignificantChangeFlagNodeModule module) {
    return new ResponsibleSignificantChangeFlagNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link ResponsibleSignificantChangeFlagNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(
      ResponsibleSignificantChangeFlagNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}