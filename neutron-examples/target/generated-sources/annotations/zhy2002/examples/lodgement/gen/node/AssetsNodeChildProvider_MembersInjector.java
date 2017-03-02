package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeChildProvider_MembersInjector
    implements MembersInjector<AssetsNodeChildProvider> {
  private final MembersInjector<OtherAssetListNode> otherAssetListNodeInjectorMembersInjector;

  private final MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjectorMembersInjector;

  private final MembersInjector<SavingsAccountListNode>
      savingsAccountListNodeInjectorMembersInjector;

  public AssetsNodeChildProvider_MembersInjector(
      MembersInjector<OtherAssetListNode> otherAssetListNodeInjectorMembersInjector,
      MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountListNode> savingsAccountListNodeInjectorMembersInjector) {
    assert otherAssetListNodeInjectorMembersInjector != null;
    this.otherAssetListNodeInjectorMembersInjector = otherAssetListNodeInjectorMembersInjector;
    assert motorVehicleListNodeInjectorMembersInjector != null;
    this.motorVehicleListNodeInjectorMembersInjector = motorVehicleListNodeInjectorMembersInjector;
    assert savingsAccountListNodeInjectorMembersInjector != null;
    this.savingsAccountListNodeInjectorMembersInjector =
        savingsAccountListNodeInjectorMembersInjector;
  }

  public static MembersInjector<AssetsNodeChildProvider> create(
      MembersInjector<OtherAssetListNode> otherAssetListNodeInjectorMembersInjector,
      MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountListNode> savingsAccountListNodeInjectorMembersInjector) {
    return new AssetsNodeChildProvider_MembersInjector(
        otherAssetListNodeInjectorMembersInjector,
        motorVehicleListNodeInjectorMembersInjector,
        savingsAccountListNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(AssetsNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherAssetListNodeInjector = otherAssetListNodeInjectorMembersInjector;
    instance.motorVehicleListNodeInjector = motorVehicleListNodeInjectorMembersInjector;
    instance.savingsAccountListNodeInjector = savingsAccountListNodeInjectorMembersInjector;
  }

  public static void injectOtherAssetListNodeInjector(
      AssetsNodeChildProvider instance,
      MembersInjector<OtherAssetListNode> otherAssetListNodeInjector) {
    instance.otherAssetListNodeInjector = otherAssetListNodeInjector;
  }

  public static void injectMotorVehicleListNodeInjector(
      AssetsNodeChildProvider instance,
      MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjector) {
    instance.motorVehicleListNodeInjector = motorVehicleListNodeInjector;
  }

  public static void injectSavingsAccountListNodeInjector(
      AssetsNodeChildProvider instance,
      MembersInjector<SavingsAccountListNode> savingsAccountListNodeInjector) {
    instance.savingsAccountListNodeInjector = savingsAccountListNodeInjector;
  }
}
