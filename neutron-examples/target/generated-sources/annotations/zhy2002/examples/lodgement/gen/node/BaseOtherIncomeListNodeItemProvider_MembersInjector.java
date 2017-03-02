package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseOtherIncomeListNodeItemProvider_MembersInjector
    implements MembersInjector<BaseOtherIncomeListNodeItemProvider> {
  private final MembersInjector<OtherIncomeNode> otherIncomeNodeInjectorMembersInjector;

  public BaseOtherIncomeListNodeItemProvider_MembersInjector(
      MembersInjector<OtherIncomeNode> otherIncomeNodeInjectorMembersInjector) {
    assert otherIncomeNodeInjectorMembersInjector != null;
    this.otherIncomeNodeInjectorMembersInjector = otherIncomeNodeInjectorMembersInjector;
  }

  public static MembersInjector<BaseOtherIncomeListNodeItemProvider> create(
      MembersInjector<OtherIncomeNode> otherIncomeNodeInjectorMembersInjector) {
    return new BaseOtherIncomeListNodeItemProvider_MembersInjector(
        otherIncomeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(BaseOtherIncomeListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherIncomeNodeInjector = otherIncomeNodeInjectorMembersInjector;
  }

  public static void injectOtherIncomeNodeInjector(
      BaseOtherIncomeListNodeItemProvider instance,
      MembersInjector<OtherIncomeNode> otherIncomeNodeInjector) {
    instance.otherIncomeNodeInjector = otherIncomeNodeInjector;
  }
}
