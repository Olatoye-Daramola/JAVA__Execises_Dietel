package africa.semicolon.cheetah.controllers;

import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.services.PackageService;
import africa.semicolon.cheetah.services.PackageServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
public class PackageController {
    private final PackageService packageService = new PackageServiceImpl();

    @PostMapping("/api/addpackage")
    public AddPackageResponse addPackage(@RequestBody AddPackageRequest addPackageRequest) {
        return packageService.addPackage(addPackageRequest);
    }

    @GetMapping("/api/package/{trackingNumber}")
    public Package findPackageByTrackingNumber(@PathVariable("trackingNumber") Integer trackingNumber) {
        return packageService.findMyPackageWithMy(trackingNumber);
    }
}
