package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LegalActionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNodeModule_ProvideLegalActionNodeFactory
    implements Factory<LegalActionNode> {
  private final LegalActionNodeModule module;

  public LegalActionNodeModule_ProvideLegalActionNodeFactory(LegalActionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LegalActionNode get() {
    return Preconditions.checkNotNull(
        module.provideLegalActionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LegalActionNode> create(LegalActionNodeModule module) {
    return new LegalActionNodeModule_ProvideLegalActionNodeFactory(module);
  }

  /** Proxies {@link LegalActionNodeModule#provideLegalActionNode()}. */
  public static LegalActionNode proxyProvideLegalActionNode(LegalActionNodeModule instance) {
    return instance.provideLegalActionNode();
  }
}
