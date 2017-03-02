package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.AreaCodeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeModule_ProvideAreaCodeNodeFactory implements Factory<AreaCodeNode> {
  private final AreaCodeNodeModule module;

  public AreaCodeNodeModule_ProvideAreaCodeNodeFactory(AreaCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AreaCodeNode get() {
    return Preconditions.checkNotNull(
        module.provideAreaCodeNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AreaCodeNode> create(AreaCodeNodeModule module) {
    return new AreaCodeNodeModule_ProvideAreaCodeNodeFactory(module);
  }

  /** Proxies {@link AreaCodeNodeModule#provideAreaCodeNode()}. */
  public static AreaCodeNode proxyProvideAreaCodeNode(AreaCodeNodeModule instance) {
    return instance.provideAreaCodeNode();
  }
}
