package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YesNoOptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNodeModule_ProvideYesNoOptionNodeFactory
    implements Factory<YesNoOptionNode<?>> {
  private final LegalActionNodeModule module;

  public LegalActionNodeModule_ProvideYesNoOptionNodeFactory(LegalActionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YesNoOptionNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideYesNoOptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YesNoOptionNode<?>> create(LegalActionNodeModule module) {
    return new LegalActionNodeModule_ProvideYesNoOptionNodeFactory(module);
  }

  /** Proxies {@link LegalActionNodeModule#provideYesNoOptionNode()}. */
  public static YesNoOptionNode<?> proxyProvideYesNoOptionNode(LegalActionNodeModule instance) {
    return instance.provideYesNoOptionNode();
  }
}
