@PostMapping
public void addUser(@Valid @NotNull @RequestBody User user) { // <.>
        userService.addTopTalent(user);
}
