package com.blueradix.android.jetpack_4_navigationcomponent;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.blueradix.android.jetpack_4_navigationcomponent.Model.Dragon;
import com.blueradix.android.jetpack_4_navigationcomponent.Model.DragonType;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DragonsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DragonsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DragonsFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    private Button nightFuryButton;
    private Button gronckleButton;
    private Button deathSongButton;
    private Button barfAndBelchButton;
    private Button terribleTerror;
    private Button deadlyNadderButton;
    private Button whisperingDeathButton;
    private Button thunderDrumButton;
    private Button monstrousNightmareButton;
    private Button boneknapperButton;

    private Dragon dragon;

    public DragonsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dragon = new Dragon();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dragons, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView argTextView = getView().findViewById(R.id.argTextView);
        DragonsFragmentArgs args = DragonsFragmentArgs.fromBundle(getArguments());
        String message = args.getMessage();
        argTextView.setText(message);

        nightFuryButton = getView().findViewById(R.id.nightFuryButton);
        nightFuryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Night Fury");
                dragon.setType(DragonType.STRIKE);
                dragon.setDescription("The Night Fury was once considered to be one of the most mysterious and fearsome species of dragons. In fact, until Hiccup befriended Toothless, no one even knew what a Night Fury looked like because they preferred to attack at night, when their black scales allowed them to blend into the night sky, making them mostly invisible. Night Furies are classified as members of the Strike Class. They have the ability to “dive bomb,” meaning that they can plummet from great heights, gaining speed as they continue downwards, then shoot a “plasma blast” at their target.\n" +
                        "\n" +
                        "For a long time, the only information that the Vikings had gathered on this rare dragon was the whistling sound of its speed cutting through the night sky, followed by a bright purple light, then finally a massive explosion.");
                dragon.setResId(R.drawable.night_fury);

                redirect(view, dragon);

                /*
                This also works but there's no point in using it anymore, as it's not type safe. we still need the key
                Bundle bundle = new Bundle();
                bundle.putSerializable("drag", dragon);
                Navigation.findNavController(getView()).navigate(R.id.dragonsToNighyFury, bundle);

                 */
            }

        });

        gronckleButton = getView().findViewById(R.id.gronckleButton);
        gronckleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Gronckle");
                dragon.setType(DragonType.BOULDER);
                dragon.setDescription("It is easy to underestimate a Gronckle, but there is more to these dragons than meets the eye. As a member of the Boulder Class, Gronckles can consume rocks and use them to fuel their “lava blasts”, which involves shooting large amounts of lava from their mouths. This ability requires Gronckles to have a high firepower in order to maintain their “lava blasts”.\n" +
                        "\n" +
                        "In addition to this, Gronckles possess one of the hardest exteriors amongst dragons, giving them a layer of nearly impenetrable natural armor. This exterior is what gives Gronckles their bulk, and also makes them a formidable opponent in battle. However, they are incredibly loyal and faithful companions.");
                dragon.setResId(R.drawable.gronckle);
                redirect(view, dragon);
            }
        });

        deathSongButton = getView().findViewById(R.id.deathSongButton);
        deathSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Death Song");
                dragon.setType(DragonType.FEAR);
                dragon.setDescription("Beautiful as a sunrise and as brutal as a Berserker, the Death Song is a notoriously hypnotic species of dragons. It does not breathe fire, but spits a sticky amber-like substance to trap its victims. We encourage any student confronting this Mystery Class dragon to tread lightly, for the Death Song is as wild as a typhoon!\n" +
                        "\n" +
                        "With their vibrant scales, frills, and enchanting call, it’s easy to become entranced by Death Songs, but beware! Beneath this resplendent exterior lies an invasive and cannibalistic species. They use their song to lure dragons to them, only to trap them in an amber cocoon. There are only a few creatures with the ability to face a Death Song unscathed. Thunderdrums are immune to the Death Song's call because they have poor hearing!\n" +
                        "\n" +
                        "When not invading Berk, untamed Death Songs can be found in several locations throughout the archipelago. Melody Island has been infamously renamed to “Death Song Island” because of its infestation of these dragons. They also lurk in the abandoned Ship Graveyard, where they spend their days hunting the giant eels that jump from the ocean’s murky depths.");
                dragon.setResId(R.drawable.death_song);
                redirect(view, dragon);
            }
        });

        barfAndBelchButton = getView().findViewById(R.id.barfAndBelchButton);
        barfAndBelchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Barf and Belch");
                dragon.setType(DragonType.MYSTERY);
                dragon.setDescription("The Hideous Zippleback is classified as a member of the Mystery Class in the Journal of Dragons. These dragons possess a unique method of attack: one head produces a thick green gas, while the other one produces sparks to light it on fire. Any Viking facing off against a Hideous Zippleback should also make sure to not breathe in the gas: It can easily disorient you! This species of dragons can also use the gas produced by one head to obscure itself from view. This makes it easier for the Hideous Zippleback to sneak up on its opponents.");
                dragon.setResId(R.drawable.barfandbelch);
                redirect(view, dragon);
            }
        });

        terribleTerror = getView().findViewById(R.id.terribleTerrorButton);
        terribleTerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Terrible Terror");
                dragon.setType(DragonType.STOKER);
                dragon.setDescription("Those who may underestimate a Terrible Terror because of its small stature should probably think again. Despite their size, Terrible Terrors are known to be one of the most feared species of dragons. As members of the Stoker Class, they possess extremely accurate flame-throwing abilities. They are also known to be especially stealthy and agile. These dragons often live in flocks along the Isle of Berk.\n" +
                        "\n" +
                        "While Vikings should never underestimate these Terrible Terrors, it is important to know that these mischievous dragons can be trained. With determination and patience, young Vikings have been able to gain the trust and friendship of these once-feared Terrible Terrors at the School of Dragons.");
                dragon.setResId(R.drawable.terrible_terror);
                redirect(view, dragon);

            }
        });

        deadlyNadderButton = getView().findViewById(R.id.deadlyNadderButton);
        deadlyNadderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Deadly Nadder");
                dragon.setType(DragonType.SHARP);
                dragon.setDescription("It is easy to be captivated by the beauty of the Deadly Nadder, but distraction around this dragon can prove to be very dangerous! Its ability to breathe fire is especially powerful, and its heat has been known to melt rocks and metal easily. This species of dragons possesses a natural armor and is covered in poisonous spines. A Deadly Nadder’s key strength is its ability to shoot hundreds of poisonous needles from its tail at once (also known as “spine shooting”).\n" +
                        "\n" +
                        "Deadly Nadder - StormflyDeadly Nadders are categorized as members of the Tracker Class, meaning that they are especially skilled in tracking objects or people. These dragons possess an acute sense of smell, which makes up for the blind spot in front of their nose.\n" +
                        "\n" +
                        "Despite the Deadly Nadder's lethal qualities, they are also known for their beauty. Their blue and yellow scales are truly a sight to behold. Should you opt to train a Deadly Nadder at the School of Dragons, you will gain a loyal friend and a fiercely beautiful warrior.");
                dragon.setResId(R.drawable.deadly_nadder);
                redirect(view, dragon);
            }
        });

        whisperingDeathButton = getView().findViewById(R.id.whisperingDeathButton);
        whisperingDeathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Whispering Death");
                dragon.setType(DragonType.BOULDER);
                dragon.setDescription("Classified as a Boulder Class dragon, the Whispering Death is one of the most feared creatures on the Isle of Berk. Vikings can identify a Whispering Death by its bulging eyes, spiked body and the hundreds of sharp teeth that line the entirety of its mouth. These deadly teeth can rotate, making an eerie noise that sounds like hundreds of people whispering. “The Whisper” and the sound of the ground rumbling are the only two signs that this beast is approaching. While other dragons are sensitive to these signs, Vikings have a difficult time hearing these noises… until it’s too late.\n" +
                        "\n" +
                        "This dragon has a snake-like body, reaching approximately ninety-five feet in length and weighing 2,500 pounds. Because of its long, thin body, its tail often makes a cracking whip noise as it moves. Razor-sharp teeth is not the only thing that makes its mouth deadly; it also possesses the strongest jaw of all the dragons, which it uses to travel through solid rock and to burrow underground. If its sharp teeth don’t get you, it can also expel scorching rings of fire or shoot the spines that grow on its head and body at you. The only known weaknesses of this dragon are its poor eyesight, sunlight and the inability of its sharp teeth to rip through steel.");
                dragon.setResId(R.drawable.whispering_death);
                redirect(view, dragon);
            }
        });

        thunderDrumButton = getView().findViewById(R.id.thunderDrumButton);
        thunderDrumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Thunderdrum");
                dragon.setType(DragonType.TIDAL);
                dragon.setDescription("Classified as members of the Tidal Class, Thunderdrums are large dragons that can thrive in land or sea. They are known for their massive mouths that generate sonic blasts strong enough to stun a human at close range. For this reason, Thunderdrums are believed to derive their power from Thor himself.\n" +
                        "\n" +
                        "Because of their sonic blasts, Thunderdrums tend to be nearly deaf, making them immune to the Death Song’s call. They can fly at extremely high altitudes. Along with their incredible strength, they also possess a prehensile tail that is strong enough to carry heavy items. They can breathe fire too, but this takes a lot of energy out of them and is not their preferred method of attack.\n" +
                        "\n" +
                        "What is also fascinating about the Thunderdrum is how it swims through the water. It has the ability to expel air from its lungs to flatten its body. This makes it easier for a Thunderdrum to skim along the surface of the water, or to dive deep down to hunt for food.");
                dragon.setResId(R.drawable.thunderdrum);
                redirect(view, dragon);
            }
        });

        monstrousNightmareButton = getView().findViewById(R.id.monstrousNightmareButton);
        monstrousNightmareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("Monstrous Nightmare");
                dragon.setType(DragonType.STOKER);
                dragon.setDescription("Monstrous Nightmares are known as some of the most ferocious and aggressive dragons. As a member of the Stoker Class, these dragons are hot-headed and have a particularly strong ability to breathe fire. Monstrous Nightmares are known for setting their entire body on fire. These dragons are incredibly fearsome and can also fly at a high speed.\n" +
                        "\n" +
                        "These creatures are usually either purple or scarlet in color with snake-like features. Sly and sneaky, Monstrous Nightmares also use their claw-tipped wings to crawl along the ground. Their intimidating glowing eyes strike fear to those who come near.\n" +
                        "\n" +
                        "While these dragons might appear intimidating at first, it is important to remember that they can be trained. ");
                dragon.setResId(R.drawable.monstrous_nightmare);
                redirect(view, dragon);
            }
        });

        boneknapperButton = getView().findViewById(R.id.boneknapperButton);
        boneknapperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dragon.setName("BoneKnapper");
                dragon.setType(DragonType.MYSTERY);
                dragon.setDescription("Categorized as a member of the Mystery Class, the Boneknapper is one of the most uncommon and abnormal species of dragons living around the Isle of Berk. As its name suggests, it creates its own armor from the bones of other dragons. Without this shell, a Boneknapper resembles a “big boneless chicken”. Because of this vulnerability, the bones a Boneknapper collects act as a protective covering and are essential for performing fundamental actions, such as roaring. The Boneknapper will search far and wide to complete its protective armor, sometimes spending years looking for a single perfect bone.\n" +
                        "\n" +
                        "Because sightings of Boneknappers were extremely rare, they were once considered a myth. Recently, however, their appearances around Berk have become well-known. ");
                dragon.setResId(R.drawable.boneknapper);
                redirect(view, dragon);
            }
        });

    }

    private void redirect(View view, Dragon dragon) {
        DragonsFragmentDirections.DragonsToDragonDetails action = DragonsFragmentDirections.dragonsToDragonDetails(dragon);
        Navigation.findNavController(view).navigate(action);
    }
}
