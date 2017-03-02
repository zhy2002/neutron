package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.DefenseServiceFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefenseServiceFlagNodeModule_ProvideDefenseServiceFlagNodeFactory
    implements Factory<DefenseServiceFlagNode> {
  private final DefenseServiceFlagNodeModule module;

  public DefenseServiceFlagNodeModule_ProvideDefenseServiceFlagNodeFactory(
      DefenseServiceFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DefenseServiceFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideDefenseServiceFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DefenseServiceFlagNode> create(DefenseServiceFlagNodeModule module) {
    return new DefenseServiceFlagNodeModule_ProvideDefenseServiceFlagNodeFactory(module);
  }

  /** Proxies {@link DefenseServiceFlagNodeModule#provideDefenseServiceFlagNode()}. */
  public static DefenseServiceFlagNode proxyProvideDefenseServiceFlagNode(
      DefenseServiceFlagNodeModule instance) {
    return instance.provideDefenseServiceFlagNode();
  }
}
