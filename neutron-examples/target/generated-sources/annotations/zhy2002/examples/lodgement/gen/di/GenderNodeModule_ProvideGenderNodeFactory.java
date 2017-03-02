package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.GenderNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenderNodeModule_ProvideGenderNodeFactory implements Factory<GenderNode> {
  private final GenderNodeModule module;

  public GenderNodeModule_ProvideGenderNodeFactory(GenderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public GenderNode get() {
    return Preconditions.checkNotNull(
        module.provideGenderNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GenderNode> create(GenderNodeModule module) {
    return new GenderNodeModule_ProvideGenderNodeFactory(module);
  }

  /** Proxies {@link GenderNodeModule#provideGenderNode()}. */
  public static GenderNode proxyProvideGenderNode(GenderNodeModule instance) {
    return instance.provideGenderNode();
  }
}
