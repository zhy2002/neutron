package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.AgeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AgeNodeModule_ProvideAgeNodeFactory implements Factory<AgeNode> {
  private final AgeNodeModule module;

  public AgeNodeModule_ProvideAgeNodeFactory(AgeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AgeNode get() {
    return Preconditions.checkNotNull(
        module.provideAgeNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AgeNode> create(AgeNodeModule module) {
    return new AgeNodeModule_ProvideAgeNodeFactory(module);
  }

  /** Proxies {@link AgeNodeModule#provideAgeNode()}. */
  public static AgeNode proxyProvideAgeNode(AgeNodeModule instance) {
    return instance.provideAgeNode();
  }
}
