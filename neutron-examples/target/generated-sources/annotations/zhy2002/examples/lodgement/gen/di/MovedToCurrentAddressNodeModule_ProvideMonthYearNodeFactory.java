package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToCurrentAddressNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final MovedToCurrentAddressNodeModule module;

  public MovedToCurrentAddressNodeModule_ProvideMonthYearNodeFactory(
      MovedToCurrentAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(MovedToCurrentAddressNodeModule module) {
    return new MovedToCurrentAddressNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link MovedToCurrentAddressNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(
      MovedToCurrentAddressNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
