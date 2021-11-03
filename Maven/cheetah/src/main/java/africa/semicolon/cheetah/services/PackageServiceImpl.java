package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.data.repositories.PackageRepository;
import africa.semicolon.cheetah.data.repositories.PackageRepositoryImpl;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;

public class PackageServiceImpl implements PackageService {
    private final PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
//        convert addPackage request to a package
        Package aPackage = new Package();
        aPackage.setName(addPackageRequest.getPackageDescription());
        aPackage.setSenderName(addPackageRequest.getSenderName());
        aPackage.setSenderPhone(addPackageRequest.getSenderPhone());
        aPackage.setDeliveryAddress(addPackageRequest.getDeliveryAddress());
        aPackage.setReceiverName(addPackageRequest.getReceiverName());
        aPackage.setReceiverPhone(addPackageRequest.getReceiverPhone());
        aPackage.setNetWeight(addPackageRequest.getPackageWeight());

//        save package
        Package savedPackage = packageRepository.save(aPackage);

//        convert saved package to addPackage response
        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverName(savedPackage.getReceiverName());
        response.setReceiverPhone(savedPackage.getReceiverPhone());
        response.setTrackingNumber(savedPackage.getTrackingNumber());

//        return converted response
        return response;
    }
}
