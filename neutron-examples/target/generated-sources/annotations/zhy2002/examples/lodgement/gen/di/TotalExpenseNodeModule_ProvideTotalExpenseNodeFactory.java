package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TotalExpenseNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNodeModule_ProvideTotalExpenseNodeFactory
    implements Factory<TotalExpenseNode> {
  private final TotalExpenseNodeModule module;

  public TotalExpenseNodeModule_ProvideTotalExpenseNodeFactory(TotalExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TotalExpenseNode get() {
    return Preconditions.checkNotNull(
        module.provideTotalExpenseNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TotalExpenseNode> create(TotalExpenseNodeModule module) {
    return new TotalExpenseNodeModule_ProvideTotalExpenseNodeFactory(module);
  }

  /** Proxies {@link TotalExpenseNodeModule#provideTotalExpenseNode()}. */
  public static TotalExpenseNode proxyProvideTotalExpenseNode(TotalExpenseNodeModule instance) {
    return instance.provideTotalExpenseNode();
  }
}
