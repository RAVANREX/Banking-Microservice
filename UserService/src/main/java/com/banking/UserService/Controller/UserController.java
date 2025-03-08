// package com.banking.UserService.Controller;

// import com.banking.UserService.dto.*;
// import com.banking.UserService.service.*;
// import lombok.RequiredArgsConstructor;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/v1")
// @RequiredArgsConstructor
// public class UserController {

//     private final UserService userService;
//     private final AuthService authService;
//     private final RoleService roleService;
//     private final MFAService mfaService;
//     private final KYCService kycService;
//     private final OAuth2ClientService oauth2ClientService;

//     /**
//      * User Management
//      */
//     @PostMapping("/users")
//     public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
//         return ResponseEntity.ok(userService.createUser(request));
//     }

//     @GetMapping("/users/{id}")
//     public ResponseEntity<UserResponse> getUser(@PathVariable Long id) {
//         return ResponseEntity.ok(userService.getUserById(id));
//     }

//     @PutMapping("/users/{id}")
//     public ResponseEntity<UserResponse> updateUser(@PathVariable Long id, @RequestBody UserRequest request) {
//         return ResponseEntity.ok(userService.updateUser(id, request));
//     }

//     @DeleteMapping("/users/{id}")
//     public ResponseEntity<String> deleteUser(@PathVariable Long id) {
//         userService.deleteUser(id);
//         return ResponseEntity.ok("User deactivated successfully");
//     }

//     @GetMapping("/users")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<List<UserResponse>> listUsers() {
//         return ResponseEntity.ok(userService.getAllUsers());
//     }

//     /**
//      * Authentication & Authorization
//      */
//     @PostMapping("/auth/login")
//     public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
//         return ResponseEntity.ok(authService.login(request));
//     }

//     @PostMapping("/auth/logout")
//     public ResponseEntity<String> logout(@RequestHeader("Authorization") String token) {
//         authService.logout(token);
//         return ResponseEntity.ok("Logged out successfully");
//     }

//     @PostMapping("/auth/refresh-token")
//     public ResponseEntity<AuthResponse> refreshToken(@RequestBody RefreshTokenRequest request) {
//         return ResponseEntity.ok(authService.refreshToken(request));
//     }

//     @PostMapping("/auth/reset-password")
//     public ResponseEntity<String> resetPassword(@RequestBody PasswordResetRequest request) {
//         authService.resetPassword(request);
//         return ResponseEntity.ok("Password reset link sent");
//     }

//     @PostMapping("/auth/change-password")
//     public ResponseEntity<String> changePassword(@RequestBody ChangePasswordRequest request) {
//         authService.changePassword(request);
//         return ResponseEntity.ok("Password updated successfully");
//     }

//     /**
//      * Role & Permissions
//      */
//     @PostMapping("/roles")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<RoleResponse> createRole(@RequestBody RoleRequest request) {
//         return ResponseEntity.ok(roleService.createRole(request));
//     }

//     @PostMapping("/roles/{id}/permissions")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<String> assignPermissions(@PathVariable Long id, @RequestBody PermissionRequest request) {
//         roleService.assignPermissions(id, request);
//         return ResponseEntity.ok("Permissions assigned successfully");
//     }

//     @GetMapping("/users/{id}/roles")
//     public ResponseEntity<List<RoleResponse>> getUserRoles(@PathVariable Long id) {
//         return ResponseEntity.ok(roleService.getUserRoles(id));
//     }

//     /**
//      * Multi-Factor Authentication (MFA)
//      */
//     @PostMapping("/mfa/enable")
//     public ResponseEntity<String> enableMFA(@RequestBody MFAEnableRequest request) {
//         mfaService.enableMFA(request);
//         return ResponseEntity.ok("MFA enabled");
//     }

//     @PostMapping("/mfa/verify")
//     public ResponseEntity<String> verifyMFA(@RequestBody MFAVerifyRequest request) {
//         mfaService.verifyMFA(request);
//         return ResponseEntity.ok("MFA verified");
//     }

//     /**
//      * KYC Verification
//      */
//     @PostMapping("/kyc")
//     public ResponseEntity<String> submitKYC(@RequestBody KYCRequest request) {
//         kycService.submitKYC(request);
//         return ResponseEntity.ok("KYC submitted successfully");
//     }

//     @GetMapping("/kyc/status")
//     public ResponseEntity<KYCStatusResponse> getKYCStatus(@RequestParam Long userId) {
//         return ResponseEntity.ok(kycService.getKYCStatus(userId));
//     }

//     /**
//      * OAuth2 Client Authentication
//      */
//     @PostMapping("/oauth2/clients")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<OAuth2ClientResponse> registerClient(@RequestBody OAuth2ClientRequest request) {
//         return ResponseEntity.ok(oauth2ClientService.registerClient(request));
//     }

//     @GetMapping("/oauth2/clients/{id}")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<OAuth2ClientResponse> getClient(@PathVariable Long id) {
//         return ResponseEntity.ok(oauth2ClientService.getClientById(id));
//     }

//     @DeleteMapping("/oauth2/clients/{id}")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<String> deleteClient(@PathVariable Long id) {
//         oauth2ClientService.deleteClient(id);
//         return ResponseEntity.ok("OAuth2 Client deleted successfully");
//     }
// }
