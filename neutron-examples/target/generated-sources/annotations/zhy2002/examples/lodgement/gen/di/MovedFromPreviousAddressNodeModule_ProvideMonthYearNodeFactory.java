package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNodeModule_ProvideMonthYearNodeFactory
    implements Factory<MonthYearNode<?>> {
  private final MovedFromPreviousAddressNodeModule module;

  public MovedFromPreviousAddressNodeModule_ProvideMonthYearNodeFactory(
      MovedFromPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MonthYearNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideMonthYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MonthYearNode<?>> create(MovedFromPreviousAddressNodeModule module) {
    return new MovedFromPreviousAddressNodeModule_ProvideMonthYearNodeFactory(module);
  }

  /** Proxies {@link MovedFromPreviousAddressNodeModule#provideMonthYearNode()}. */
  public static MonthYearNode<?> proxyProvideMonthYearNode(
      MovedFromPreviousAddressNodeModule instance) {
    return instance.provideMonthYearNode();
  }
}
