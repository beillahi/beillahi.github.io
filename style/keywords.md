Formal Verification, Algorithmic Verification,  Software Verification
Asynchronous programming is widely adopted for building responsive and efficient software. Modern languages
such as C# provide async/await primitives to simplify the use of asynchrony. However, the use of
these primitives remains error-prone because of the non-determinism in their semantics. In this paper, we
propose an approach for refactoring a given sequential program into an asynchronous program that uses
async/await, called asynchronization. The refactoring process is parametrized by a set of methods to replace
with given asynchronous versions, and it is constrained to avoid introducing data races. Since the space of
possible solutions is exponential in general, we focus on characterizing the delay complexity that quantifies
the delay between two consecutive outputs.We show that this is polynomial time modulo an oracle for solving
reachability (assertion checking) in sequential programs. We also describe a pragmatic approach based on
an interprocedural data-flow analysis with polynomial-time delay complexity. The latter approach has been
implemented and evaluated on a number of non-trivial C# programs extracted from open-source repositories

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain, Software Verification

Quantum optics systems provide a promising platform for universal quantum computing, since they
link quantum computation and quantum communication in the same framework. Thanks to their high capability,
quantum computers are considered good candidates to replace classical cryptography and supercomputing
systems which require a robust and accurate verification process. In this paper, we introduce a tool for the
formal verification of quantum computing systems based on the soundness and accuracy of high-order-logic
theorem proving augmented by a set of decision procedures to automate the proof process.

Formal Verification, Algorithmic Verification,  Software Verification

Quantum computing systems promise to increase the capabilities for solving problems which classical
computers cannot handle adequately, such as integers factorization. In this paper, we present a formal modeling
and verification approach for optical quantum circuits, where we build a rich library of optical quantum gates
and develop a proof strategy in higher-order logic to reason about optical quantum circuits automatically. The
constructed library contains a variety of quantum gates ranging from 1-qubit to 3-qubit gates that are sufficient
to model most existing quantum circuits. As real world applications, we present the formal analysis of several
quantum circuits including quantum full adders and the Grover’s oracle circuits, for which we have proved the
behavioral correctness and calculated the operational success rate, which has never been provided in the literature.
We show through several case studies the efficiency of the proposed framework in terms of the scalability and
modularity.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain, Software Verification

Smart contracts facilitate the execution of programmable
code on a blockchain. The cost for executing smart
contract code is metered using gas – the exact amount of which is
based on the computational complexity of the underlying smart
contract. Hence, it is imperative to optimize smart contract code
to reduce gas consumption and, in some instances, to even avoid
malicious attacks. In this paper, we propose an approach to
optimize the gas consumption of smart contracts, specifically loop
control structures. We present a prototype implementation of our
approach using off-the-shelf tools for Solidity smart contracts.We
experimentally evaluate our technique using 72 Solidity smart
contracts. Our evaluation demonstrates the average gas cost
savings per transaction to be around 23; 943 gas units, or an
equivalent 21% decrease in gas costs. Although the approach
causes a slight increase in deployment costs due to the additional
internal functions, this is only 16; 710 gas units on the average,
or a 5% of the total deployment cost. As this overhead remains
quite reasonable when compared to the gas cost savings for
each transaction, it also confirms the efficacy, practicality and
effectiveness of the proposed methodology


Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain, Software Verification


Transactional access to databases is an important abstraction
allowing programmers to consider blocks of actions (transactions) as
executing in isolation. The strongest consistency model is serializability,
which ensures the atomicity abstraction of transactions executing over
a sequentially consistent memory. Since ensuring serializability carries a
significant penalty on availability, modern databases provide weaker consistency
models, one of the most prominent being snapshot isolation. In
general, the correctness of a program relying on serializable transactions
may be broken when using weaker models. However, certain programs
may also be insensitive to consistency relaxations, i.e., all their properties
holding under serializability are preserved even when they are executed
over a weak consistent database and without additional synchronization.
In this paper, we address the issue of verifying if a given program is robust
against snapshot isolation, i.e., all its behaviors are serializable even if it
is executed over a database ensuring snapshot isolation. We show that
this verification problem is polynomial time reducible to a state reachability
problem in transactional programs over a sequentially consistent
shared memory. This reduction opens the door to the reuse of the classic
verification technology for reasoning about weakly-consistent programs.
In particular, we show that it can be used to derive a proof technique
based on Lipton’s reduction theory that allows to prove programs robust.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis


Distributed storage systems and databases are widely used by various types of applications. Transactional
access to these storage systems is an important abstraction allowing application programmers
to consider blocks of actions (i.e., transactions) as executing atomically. For performance reasons, the
consistency models implemented by modern databases are weaker than the standard serializability
model, which corresponds to the atomicity abstraction of transactions executing over a sequentially
consistent memory. Causal consistency for instance is one such model that is widely used in practice.
In this paper, we investigate application-specific relationships between several variations of causal
consistency and we address the issue of verifying automatically if a given transactional program is
robust against causal consistency, i.e., all its behaviors when executed over an arbitrary causally
consistent database are serializable. We show that programs without write-write races have the same
set of behaviors under all these variations, and we show that checking robustness is polynomial time
reducible to a state reachability problem in transactional programs over a sequentially consistent
shared memory. A surprising corollary of the latter result is that causal consistency variations which
admit incomparable sets of behaviors admit comparable sets of robust programs. This reduction also
opens the door to leveraging existing methods and tools for the verification of concurrent programs
(assuming sequential consistency) for reasoning about programs running over causally consistent
databases. Furthermore, it allows to establish that the problem of checking robustness is decidable
when the programs executed at different sites are finite-state.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

Concurrent accesses to databases are typically encapsulated
in transactions in order to enable isolation from other concurrent computations
and resilience to failures. Modern databases provide transactions
with various semantics corresponding to different trade-offs between consistency
and availability. Since a weaker consistency model provides better
performance, an important issue is investigating the weakest level of
consistency needed by a given program (to satisfy its specification). As
a way of dealing with this issue, we investigate the problem of checking
whether a given program has the same set of behaviors when replacing
a consistency model with a weaker one. This property known as robustness
generally implies that any specification of the program is preserved
when weakening the consistency. We focus on the robustness problem
for consistency models which are weaker than standard serializability,
namely, causal consistency, prefix consistency, and snapshot isolation.
We show that checking robustness between these models is polynomial
time reducible to a state reachability problem under serializability. We
use this reduction to also derive a pragmatic proof technique based on
Lipton’s reduction theory that allows to prove programs robust. We have
applied our techniques to several challenging applications drawn from the
literature of distributed systems and databases.
Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain
Formal Verification, Algorithmic Verification, 

research,
which provides unique prospects to build high-speed communication systems.
Recent advancements in fabrication technology allow on-chip manufacturing
of signal processing devices. This fact has lead to the
widespread use of photonics in industrial critical applications such as
telecommunication, biophotonics and aerospace. One the most challenging
aspects in the photonics industry is the accurate modeling and analysis
of photonic devices due to the complex nature of light and optical
components. In this paper, we propose to use higher-order-logic theorem
proving to improve the analysis accuracy by overcoming the known
limitations of incompleteness and soundness of existing approaches (e.g.,
paper-and-pencil based proofs and simulation). In particular, we formalize
the notion of transfer function using the signal-flow-graph theory
which is the most fundamental step to model photonic circuits. Consequently,
we formalize and verify the important properties of the stability
and the resonance of photonic systems. In order to demonstrate the effectiveness
of the proposed infrastructure, we present the formal analysis
of a widely used double-coupler double-ring (DCDR) photonic processor.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

Power electronics is an active area of research which has
widespread applications in safety and cost critical domains such as power
grids, biomedical devices and avionics systems. The complexity of power
electronic systems is rapidly reaching a point where it will become difficult
to verify the correctness and robustness of underlying designs. In this
paper, we propose to use a recent formalization of signal-flow-graphs in
higher-order-logic for the formal analysis of power electronic converters,
which are the foremost components of modern power electronic systems.
In particular, we demonstrate the necessary steps to formally reason
about the critical properties (e.g., efficiency, stability and resonance)
of power electronic converters by using their corresponding signal-flowgraph
based high-level models. In order to demonstrate the utilization
of the proposed infrastructure, we present the formal analysis of a couple
of widely used power converters, namely a pulse width modulation
push-pull DC-DC converter and a 1-boost cell DC-DC converter.
Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

We present the Layered Merkle Patricia Trie
(LMPT), a performant storage data structure for processing
transactions in high-throughput systems when compared
to traditional Merkle Patricia Tries used in Ethereum
clients. LMPTs keep smaller intermediary tries in memory
to alleviate read and write amplification from high-latency
disk storage. As an additional feat, they also allow for the
I/O and transaction verifier threads to be scheduled in
parallel and independently. LMPTs can ultimately reduce
significant I/O traffic that happens on the critical path
of transaction processing. Empirical results presented here
confirm that LMPTs can process up to ×6 more transactions
per second on real-life workloads when compared to
existing Ethereum clients



Quantum mechanics based computing systems are expected to have high capabilities
and are considered good candidates to replace classical cryptography and supercom-
puting systems. Among many implementations, quantum optics systems provide a
promising platform to implement universal quantum computers, since they link quan-
tum computation and quantum communication in the same framework. Recently, sev-
eral quantum gates, circuits, and protocols have been experimentally realized using
optics. Despite the fact that big advances in building the physical quantum computers
were achieved, there are no currently available industrial computer aided tools that
can perform the modeling, analysis, and verification of optical quantum computing
systems. In this thesis, we tackle the idea of design automation for quantum cir-
cuits, where we use a sound language, higher order logic, to model and reason about
quantum circuits formally. In particular, we propose a framework for the hierarchical
modeling and automated verification of quantum computing circuits. The modeling
approach captures quantum models built hierarchically from quantum gates, which
models are readily available in a library. The analysis and verification of composed
circuits is done seamlessly based on dedicated mathematical foundations formalized
in the theorem prover. Specifically, the tensor product and linear projection are used
to extract the quantum circuit outputs. Subsequently, a rich library of quantum gates
which includes 1-qubit, 2-qubit, and 3-qubit gates is formalized. In order to auto-
mate the analysis process, we developed a decision procedure to eliminate the need
of user guidance throughout the formal proofs. To demonstrate the efectiveness of

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

we introduce the idea of hierarchical verification
for quantum circuits, where we use a powerful language, higher-order
logic, to reason about quantum circuits formally. We propose a formal
modeling and verification approach that captures quantum models built
hierarchically from primitive optical quantum gates. The analysis and
verification of composed circuits is done seamlessly based on dedicated
mathematical foundations formalized in the HOL Light theorem prover.
In order to demonstrate the effectiveness of the proposed infrastructure,
we present the formal analysis of the controlled-phase gate and Shor’s
factoring quantum circuits.


Signal-flow-graph theory provides an efficient framework to
model various engineering and physical systems at a higher-level of
abstraction. In this paper, we present the formalization of the signalflow-
graph theory with an ultimate goal to conduct the formal analysis
of engineering systems within a higher-order-logic theorem prover. In particular,
our formalization can tackle system models which are based on
undirected graphs.We also present the formalization of the system transfer
function and associated properties such as stability and resonance.
In order to demonstrate the effectiveness of our work, we present the
formal analysis of two engineering systems namely the PANDA Vernier
resonator and the z-source impedance network, which are commonly used
in photonics and power electronics, respectively.


While smart contracts have the potential to revolutionize
many important applications like banking, trade, and supplychain,
their reliable deployment begs for rigorous formal
verification. Since most smart contracts are not annotated
with formal specifications, general verification of functional
properties is impeded.
In this work, we propose an automated approach to verify
unannotated smart contracts against specifications ascribed
to a few manually-annotated contracts. In particular, we
propose a notion of behavioral refinement, which implies inheritance
of functional properties. Furthermore, we propose
an automated approach to inductive proof, by synthesizing
simulation relations on the states of related contracts. Empirically,
we demonstrate that behavioral simulations can be
synthesized automatically for several ubiquitous classes like
tokens, auctions, and escrow, thus enabling the verification
of unannotated contracts against functional specifications.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis



Abstract—Smart contracts facilitate the execution of programmable
code on a blockchain. The cost for executing smart
contract code is metered using gas – the exact amount of which is
based on the computational complexity of the underlying smart
contract. Hence, it is imperative to optimize smart contract code
to reduce gas consumption and, in some instances, to even avoid
malicious attacks. In this paper, we propose an approach to
optimize the gas consumption of smart contracts, specifically loop
control structures. We present a prototype implementation of our
approach using off-the-shelf tools for Solidity smart contracts.We
experimentally evaluate our technique using 72 Solidity smart
contracts. Our evaluation demonstrates the average gas cost
savings per transaction to be around 23; 943 gas units, or an
equivalent 21% decrease in gas costs. Although the approach
causes a slight increase in deployment costs due to the additional
internal functions, this is only 16; 710 gas units on the average,
or a 5% of the total deployment cost. As this overhead remains
quite reasonable when compared to the gas cost savings for
each transaction, it also confirms the efficacy, practicality and
effectiveness of the proposed methodology.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

With the emergence of decentralized finance, smart
contracts and their users become more and more susceptible to
expensive exploitations. This paper investigates the Ponzi scheme
transaction order dependency vulnerabilities in smart contracts.
A static analysis based approach is proposed to automatically
locate and rectify such Ponzi scheme vulnerabilities, and a
prototype tool using Slither, a static analyzer for Solidity, is also
developed. All in all, empirical results on a benchmark suite
containing 51 Solidity smart contracts show that the proposed
methodology can be used successfully to both detect such vulnerabilities
and rectify them, or to certify that a Solidity smart
contract under question does not contain such vulnerabilities.

Formal Verification, Algorithmic Verification, Program Analysis, Program Synthesis
Distributed Systems, Blockchain

Over the past decades, distributed software became an integral part of our society, being used in
various domains like online banking or shopping, distance learning, supply chain, and telecommuting.
Developing correct and efficient distributed systems is a major and timely challenge. The
objective of this dissertation is to propose algorithmic techniques for improving the reliability of
such software, focusing on applications ran on top of distributed storage systems like databases and
blockchain. Databases allow applications to access data concurrently from multiple sites in a network.
Blockchain is a cryptographically-secure distributed ledger that allows to perform irreversible
actions between different parties without a trusted authority.
The effect of a set of database transactions executing in parallel is specified using a formalism
called consistency model. For instance, serializability states that a set of transactions behave as if
they were executed serially one after another even if they actually overlap in time. Although simple
to understand, serializability carries a significant penalty on performance and modern databases
implement weaker consistency models. In general, these weak models are more complex to reason
about. In this dissertation, we investigate the problem of checking a property of applications called
robustness. Given two comparable consistency models, an application is called robust if it has the
same behaviors when ran on top of databases implementing these two models. This dissertation
investigates the theoretical complexity of checking robustness in the context of several consistency
models: causal consistency, prefix consistency, snapshot isolation, and serializability. It provides
non-trivial reductions to a well-studied problem in formal verification, assertion checking, that enables
the reuse of existing verification technology. Besides theoretical results, it proposes pragmatic
approaches based on under/over-approximations that are evaluated on practical applications.
Applications ran on top of blockchain are deployed in the form of smart contracts that manipulate
the blockchain state. Smart contracts are mainly used to govern trading in cryptoassets that are
worth billions of US dollars, and bugs can lead to huge financial losses. Exacerbating the impact
of these bugs is the fact that smart contracts cannot be modified once they are deployed on the
blockchain. Applying techniques from formal verification to audit smart contracts can help in
avoiding expensive bugs. However, since most smart contracts are not annotated with formal
specifications, formal verification of functional properties is impeded. To overcome this problem,
this dissertation investigates notions of refinement between smart contracts, which enable the reuse
of verified contracts as specifications for other contracts, thus scaling up the overall verification

Formal Verification, Algorithmic Verification, 
