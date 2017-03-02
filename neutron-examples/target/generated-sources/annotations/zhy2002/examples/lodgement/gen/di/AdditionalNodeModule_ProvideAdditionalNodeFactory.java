package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AdditionalNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalNodeModule_ProvideAdditionalNodeFactory
    implements Factory<AdditionalNode> {
  private final AdditionalNodeModule module;

  public AdditionalNodeModule_ProvideAdditionalNodeFactory(AdditionalNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AdditionalNode get() {
    return Preconditions.checkNotNull(
        module.provideAdditionalNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AdditionalNode> create(AdditionalNodeModule module) {
    return new AdditionalNodeModule_ProvideAdditionalNodeFactory(module);
  }

  /** Proxies {@link AdditionalNodeModule#provideAdditionalNode()}. */
  public static AdditionalNode proxyProvideAdditionalNode(AdditionalNodeModule instance) {
    return instance.provideAdditionalNode();
  }
}
